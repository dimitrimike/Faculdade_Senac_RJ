class Carro {
    modelo;
    cor;
    placa;
    velocidade=0;
    acelerar(){
        this.velocidade = this.velocidade + 1;
        alert(`A velocidade do carro aumentou para ${this.velocidade} km/h.`)
    }
    frear(){
        if (this.velocidade > 0) {
            this.velocidade = this.velocidade - 1;
            alert(`A velocidade do carro diminuiu para ${this.velocidade} km/h.`)
        } else {
            alert(`A velocidade do carro não pode ser negativa`)
        }
    }
}