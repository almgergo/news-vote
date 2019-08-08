import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NewsFlowComponent } from './core/components/news-flow/news-flow.component';
import { HttpClientModule } from '@angular/common/http';
import { ArticleComponent } from './core/components/article/article.component';

@NgModule({
  declarations: [AppComponent, NewsFlowComponent, ArticleComponent],
  imports: [BrowserModule, HttpClientModule, AppRoutingModule],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
