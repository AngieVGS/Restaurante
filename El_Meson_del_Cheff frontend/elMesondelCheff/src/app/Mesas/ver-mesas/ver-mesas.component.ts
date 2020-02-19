import { Component, OnInit } from '@angular/core';
import { Mesa } from 'src/app/Modelo/Mesa';
import { Router } from '@angular/router';
import { MesasService } from 'src/app/Service/ServiceMesas/mesas.service';

@Component({
  selector: 'app-ver-mesas',
  templateUrl: './ver-mesas.component.html',
  styleUrls: ['./ver-mesas.component.css']
})
export class VerMesasComponent implements OnInit {

  mesas: Mesa[];
  constructor(private service: MesasService, private router: Router) { }

  ngOnInit(): void {
    this.service.getMesas().subscribe(data => {
      this.mesas = data;
    });
  }
}
