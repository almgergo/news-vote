import { Component, Input } from '@angular/core';
import { Article } from '../../model/article';
import { faStar } from '@fortawesome/free-solid-svg-icons/faStar';
import { faStar as faStarEmpty } from '@fortawesome/free-regular-svg-icons/faStar';
import { NewsService } from '../../services/news.service';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.scss'],
})
export class ArticleComponent {
  faStar = faStar;
  faStarEmpty = faStarEmpty;

  ratings = Array.from({ length: 10 }, (tmp: any, index: number) => index + 1);
  showRatings = false;
  selectedRating = undefined;

  @Input() article: Article;

  constructor(private newsService: NewsService) {}

  setRating(rating: number) {
    this.article.userRating = rating;

    this.newsService.saveRating(this.article).subscribe(console.log);
  }
}
