import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'El Meson Del Cheff';

  constructor(private router: Router) {}

  VerMenu() {
    this.router.navigate(['verMenu']);
  }

  VerMesas() {
    this.router.navigate(['verMesas']);
  }


}
