import { Component, OnInit } from '@angular/core';
import { Router, NavigationStart } from '@angular/router';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html'
})
export class HeaderComponent implements OnInit {
  url: string;
  
  constructor(private _router: Router) {
    this._router.events
            .subscribe((e: NavigationStart) => {
                this.url = e.url;
        });
  }

  ngOnInit() {
  }

  urlAtiva(url: string): boolean {
      return this.url && this.url.includes(url);
  }
}
