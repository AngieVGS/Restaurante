import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatCardModule} from '@angular/material/card';
import { FormsModule} from '@angular/forms';
import { IngredientesService } from './Service/ServiceIngredientes/ingredientes.service';
import { VerPlatosComponent } from './Menu/ver-platos/ver-platos.component';
import { VerMesasComponent } from './Mesas/ver-mesas/ver-mesas.component';
import { CardPlatoComponent } from './Menu/card-plato/card-plato.component';
import { HttpClientModule } from '@angular/common/http';
import { CardMesasComponent } from './Mesas/card-mesas/card-mesas.component';
import { LoginComponent } from './login/login.component';
import { ConfirmEmailComponent } from './login/confirm-email/confirm-email.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatNativeDateModule } from '@angular/material/core';


@NgModule({
  declarations: [
    AppComponent,
    VerPlatosComponent,
    VerMesasComponent,
    CardPlatoComponent,
    CardMesasComponent,
    LoginComponent,
    ConfirmEmailComponent,
  ],
  imports: [
    BrowserAnimationsModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    MatCardModule,
    FormsModule,
    HttpClientModule,
    FormsModule,
    MatNativeDateModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ],
  providers: [IngredientesService],
  bootstrap: [AppComponent]
})
export class AppModule { }
