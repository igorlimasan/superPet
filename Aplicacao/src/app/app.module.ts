import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';
import { CadastroPetModule } from './cadastro-pet/cadastro-pet.module';
import { DetalhePetModule } from './detalhe-pet/detalhe-pet.module';
import { CadastroUsuarioModule } from './cadastro-usuario/cadastro-usuario.module';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { FiltroComponent } from './filtro/filtro.component';
import { ListaPetComponent } from './lista-pet/lista-pet.component';
import { DetalhePetComponent } from './detalhe-pet/detalhe-pet.component';
import { CadastroPetComponent } from './cadastro-pet/cadastro-pet.component';
import { CadastroUsuarioComponent } from './cadastro-usuario/cadastro-usuario.component';
import { LoginComponent } from './login/login.component';
import { LandingPageComponent } from './landing-page/landing-page.component';
import { AlertaComponent } from './alerta/alerta.component';
import { FotoComponent } from './foto/foto.component';
import { Webservice } from './helpers/webservice';

const appRoutes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'cadastro-usuario', component: CadastroUsuarioComponent },
  { path: 'cadastro-usuario/:id', component: CadastroUsuarioComponent },
  { path: 'superpets', component: ListaPetComponent },
  { path: 'favoritos', component: ListaPetComponent },
  { path: 'meus-pets', component: ListaPetComponent },
  { path: 'cadastro-pet', component: CadastroPetComponent },
  { path: 'editar-pet/:id', component: CadastroPetComponent },
  { path: 'detalhe-pet/:id', component: DetalhePetComponent },
  { path: '**', component: LandingPageComponent }
];

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FiltroComponent,
    ListaPetComponent,
    LoginComponent,
    LandingPageComponent,    
    AlertaComponent, 
    FotoComponent,
    DetalhePetComponent
  ],
  
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,

    CadastroPetModule,
    DetalhePetModule,
    CadastroUsuarioModule,

    RouterModule.forRoot(appRoutes)
  ],
  providers: [ Webservice ],
  bootstrap: [AppComponent]
})
export class AppModule { }
