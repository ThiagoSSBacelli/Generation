import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { environment } from 'src/environments/environment.prod';
import { tema } from '../model/Tema';
import { TemaService } from '../service/tema.service';

@Component({
  selector: 'app-tema',
  templateUrl: './tema.component.html',
  styleUrls: ['./tema.component.css']
})
export class TemaComponent implements OnInit {


  Tema: tema =  new tema()
  listaTemas: tema[]

  constructor(
    private router: Router,
    private temaServiuce: TemaService
  ) { }

  ngOnInit() {
    if (environment.token == '') {
      this.router.navigate(['/entrar'])
    }
    
    this.findAllTemas()
  }

  findAllTemas(){
    this.temaServiuce.getallTema().subscribe((resp: tema[]) => {
      this.listaTemas = resp
    })
  }

  cadastrar(){
    this.temaServiuce.postTema(this.Tema).subscribe((resp:tema)=>{
      this.Tema = resp
      alert('Tema cadastrado com sucesso!')
      this.findAllTemas()
      this.Tema = new tema()
    })
  }

}
