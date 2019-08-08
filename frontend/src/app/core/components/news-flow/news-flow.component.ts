import { Component, OnInit } from '@angular/core';
import { NewsService } from '../../services/news.service';
import { faBtc } from '@fortawesome/free-brands-svg-icons';
import { faSpinner } from '@fortawesome/free-solid-svg-icons';

@Component({
  selector: 'app-news-flow',
  templateUrl: './news-flow.component.html',
  styleUrls: ['./news-flow.component.scss'],
})
export class NewsFlowComponent {
  faBitcoin = faBtc;
  faSpinner = faSpinner;

  constructor(private newsService: NewsService) {}
}
