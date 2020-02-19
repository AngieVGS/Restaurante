import { Component, OnInit } from '@angular/core';
import { PlatosService } from 'src/app/Service/ServicePlatos/platos.service';
import { Router } from '@angular/router';
import { THIS_EXPR } from '@angular/compiler/src/output/output_ast';
import { Plato } from 'src/app/Modelo/Plato';

@Component({
  selector: 'app-ver-platos',
  templateUrl: './ver-platos.component.html',
  styleUrls: ['./ver-platos.component.css']
})
export class VerPlatosComponent implements OnInit {

  platos: Plato[];
  constructor(private service: PlatosService, private router: Router) { }

  ngOnInit(): void {
    this.service.getPlatos().subscribe(data => {
      this.platos = data;
    });
  }

}
