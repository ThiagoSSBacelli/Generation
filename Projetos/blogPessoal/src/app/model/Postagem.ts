import { tema } from "./Tema"
import { User } from "./User"

export class Postagem {

    public id: number
    public titulo: String
    public texto: String
    public data: Date
    public usuario: User
    public tema: tema   
}