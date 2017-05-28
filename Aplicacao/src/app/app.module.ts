import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

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

const appRoutes: Routes = [
  { path: '', component: LandingPageComponent },
  { path: 'login', component: LoginComponent },
  { path: 'cadastro-usuario', component: CadastroUsuarioComponent },
  { path: 'cadastro-usuario/:id', component: CadastroUsuarioComponent },
  { path: 'superpets', component: ListaPetComponent },
  { path: 'cadastro-pet', component: CadastroPetComponent },
  { path: 'cadastro-pet/:id', component: CadastroPetComponent },
  { path: 'detalhe-pet/:id', component: DetalhePetComponent },
  { path: '**', component: LandingPageComponent }
];

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
    LandingPageComponent,    
    AlertaComponent
  ],
  
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
