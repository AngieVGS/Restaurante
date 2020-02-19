import { Pedido } from './Pedido';

export class Mesa {
  id_mesa: number;
	estado_mesa: boolean;
	nombre_mesa: string;
	descripcion_mesa: string;
  pedidoActual: Pedido;
  imagen: string;
}
