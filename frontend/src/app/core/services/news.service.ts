import { Injectable } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Observable } from 'rxjs';
import { NewsResponse } from '../model/news-response';
import { Article } from '../model/article';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root',
})
export class NewsService {
  articles: Observable<Article[]>;

  constructor(private http: HttpClient) {
    this.articles = this.loadNewsArticles().pipe(map((response: NewsResponse) => response.articles));
  }

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
}
