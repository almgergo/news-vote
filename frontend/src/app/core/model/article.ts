import { Source } from './source';

export interface Article {
  source: Source;
  author: string;
  title: string;
  description: string;
  url: string;
  urlToImage: string;
  publishedAt: Date;
  content: string;

  userRating?: number;
  voteId?: number;
}
