import { Component, OnInit , Input} from '@angular/core';
import { Plato } from 'src/app/Modelo/Plato';

@Component({
  selector: 'app-card-plato',
  templateUrl: './card-plato.component.html',
  styleUrls: ['./card-plato.component.css']
})
export class CardPlatoComponent implements OnInit {

  @Input() plato: Plato;

  constructor() { }

  ngOnInit(): void {
    console.log(this.plato);
  }

}
