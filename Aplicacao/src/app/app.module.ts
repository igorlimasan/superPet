import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FiltroComponent } from './filtro/filtro.component';
import { ListaPetComponent } from './lista-pet/lista-pet.component';
import { DetalhePetComponent } from './detalhe-pet/detalhe-pet.component';
import { CadastroPetComponent } from './cadastro-pet/cadastro-pet.component';
import { CadastroUsuarioComponent } from './cadastro-usuario/cadastro-usuario.component';
import { LoginComponent } from './login/login.component';
<<<<<<< Updated upstream
import { LandingPageComponent } from './landing-page/landing-page.component';
=======
import { AlertaComponent } from './alerta/alerta.component';
>>>>>>> Stashed changes

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FiltroComponent,
    ListaPetComponent,
    DetalhePetComponent,
    CadastroPetComponent,
    CadastroUsuarioComponent,
    LoginComponent,
<<<<<<< Updated upstream
    //COMPONENTES CRIADOS
    LandingPageComponent    
=======
    AlertaComponent
>>>>>>> Stashed changes
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
