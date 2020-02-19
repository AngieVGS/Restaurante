import { Ingrediente } from './Ingrediente';

export class Plato {
  id_plato: number;
  nombre_plato: string;
  ingredientes: Array<Ingrediente>;
  imagen: string;
  descripcion_plato: string;
  precio_plato: number;
}
