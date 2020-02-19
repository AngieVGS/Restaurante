import { Component, OnInit, Input } from '@angular/core';
import { Mesa } from 'src/app/Modelo/Mesa';

@Component({
  selector: 'app-card-mesas',
  templateUrl: './card-mesas.component.html',
  styleUrls: ['./card-mesas.component.css']
})
export class CardMesasComponent implements OnInit {

  @Input() mesa: Mesa;

  constructor() { }

  ngOnInit(): void {
    this.getImagen();
    console.log(this.mesa);
  }

  getImagen() : void {
    if ( this.mesa.estado_mesa) {
      this.mesa.imagen = 'https://previews.123rf.com/images/iko/iko1512/iko151200005/48860601-grupo-multi%C3%A9tnico-de-amigos-felices-que-almuerzan-y-divertirse-en-el-restaurante.jpg';
    } else {
      this.mesa.imagen = 'https://www.talentintuition.com/media/1095/2551032.jpg?anchor=center&mode=crop&width=1500';

    }
  }
}
