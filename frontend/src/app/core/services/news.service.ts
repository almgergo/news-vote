import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';
import { NewsResponse } from '../model/news-response';
import { Article } from '../model/article';
import { map } from 'rxjs/operators';
import { Rating } from '../model/rating';

@Injectable({
  providedIn: 'root',
})
export class NewsService {
  articles: Observable<Article[]>;
  ratings: Map<string, Rating> = new Map();

  constructor(private http: HttpClient) {
    // load articles
    this.articles = this.loadNewsArticles().pipe(map((response: NewsResponse) => response.articles));

    // load ratings
    this.loadRatings().subscribe((ratings: Rating[]) => {
      this.ratings = new Map();
      ratings.forEach((rating) => this.ratings.set(rating.url, rating));
    });
  }

  /**
   * Load news articles from the web
   */
  loadNewsArticles(): Observable<NewsResponse> {
    const now = new Date();
    now.setMonth(now.getMonth() - 1);

    const params = new HttpParams()
      .set('q', 'bitcoin')
      .set('from', `${now.getFullYear()}-${now.getMonth() + 1}-${now.getDate()}`)
      .set('apiKey', environment.news.apiKey)
      .set('sortBy', 'publishedAt');

    return this.http.get<NewsResponse>(environment.news.requestUrl, { params });
  }

  /**
   * Load article ratings from the backend
   */
  loadRatings(): Observable<Rating[]> {
    return this.http.get<Rating[]>('/api/articles');
  }

  /**
   * Save a vote for an article to the backend
   */
  saveVote(article: Article): Observable<number> {
    const body = { value: article.userRating, articleUrl: article.url, id: article.voteId };

    return this.http.post<number>('/api/votes', body);
  }
}
