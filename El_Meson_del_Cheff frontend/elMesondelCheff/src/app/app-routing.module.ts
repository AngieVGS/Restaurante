import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { VerPlatosComponent } from './Menu/ver-platos/ver-platos.component';
import { VerMesasComponent } from './Mesas/ver-mesas/ver-mesas.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  {path: 'verMenu', component: VerPlatosComponent},
  {path: 'verMesas', component: VerMesasComponent},
  {path: 'login', component: LoginComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
