import { Ingrediente } from './Ingrediente';

export class Plato {
  idPlato: number;
  nombrePlato: string;
  ingredientes: Array<Ingrediente>;
  imagen: string;
  descripcion: string;
  precioPlato: number;
}
