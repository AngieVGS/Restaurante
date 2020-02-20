import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-side-nav',
  templateUrl: './side-nav.component.html',
  styleUrls: ['./side-nav.component.css']
})
export class SideNavComponent implements OnInit {

  opened: boolean;
  verMenu: boolean;
  verMesas: boolean;

  state: string;

  constructor(private router: Router) { }

  ngOnInit(): void {
    this.state = 'Mesas';
    this.verMenu = true;
    this.verMesas = false;

  }

  VerMenu() {
    this.router.navigate(['verMenu']);
  }

  VerMesas() {
    this.router.navigate(['verMesas']);
  }

}
