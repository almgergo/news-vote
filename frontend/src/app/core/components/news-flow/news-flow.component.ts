import { Component, OnInit } from '@angular/core';
import {NewsService} from '../../services/news.service';

@Component({
  selector: 'app-news-flow',
  templateUrl: './news-flow.component.html',
  styleUrls: ['./news-flow.component.scss']
})
export class NewsFlowComponent implements OnInit {

  constructor(private newsService: NewsService) { }

  ngOnInit() {
  }

}
