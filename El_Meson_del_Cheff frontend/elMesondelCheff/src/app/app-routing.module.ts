import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VerPlatosComponent } from './Menu/ver-platos/ver-platos.component';
import { VerMesasComponent } from './Mesas/ver-mesas/ver-mesas.component';
import { LoginComponent } from './login/login.component';
import { ConfirmEmailComponent } from './login/confirm-email/confirm-email.component';
import { AgregarPedidoComponent } from './AgregarPedido/agregar-pedido.component';
import { PedidosComponent } from './AgregarPedido/pedidos/pedidos.component';

const routes: Routes = [
  {path: 'verMenu', component: VerPlatosComponent},
  {path: 'verMesas', component: VerMesasComponent},
  {path: 'login', component: LoginComponent},
  {path: 'app-confirm-email', component: ConfirmEmailComponent},
  {path: 'agregarPedido', component: AgregarPedidoComponent},
  {path: 'app-pedidos', component: PedidosComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
