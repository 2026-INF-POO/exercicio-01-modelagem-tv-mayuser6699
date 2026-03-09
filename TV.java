/*
Edite o arquivo TV.java e construa uma modelagem para representar uma TV utilizando as informações abaixo.

Uma televisão possui as seguintes características:

tamanho de tela (em polegadas);
volume: de 1 a 10 iniciando em 5;
marca;
voltagem (220 e 110);
canal.
A televisão pode realizar as seguintes ações:

ligar: ao ligar a televisão deve imprimir seu consumo. O consumo deve ser definido pela voltagem multiplicada pela quantidades de polegadas;
desligar;
aumentar e diminuir o volume;
subir e descer canal.
*/

Class TV{
  int tamanho;
  int volume=5;
  string marca;
  int voltagem;
  int canal;
  boolean ligada;
  int consumo;

  int aumentarVolume(){
    if(volume<=10){
      volume++;
    }
    return volume;
  }

  int diminuirVolume(){
    if(volume>1){
      volume--;
    }
    return volume;
  }
  void ligar(){
   ligada=true;
   System.out.println("Tv ligada");
   consumo=voltagem*tamanho;
    System.out.println("consumo " + consumo);
  }
  
 void desligar(){
   ligada=false;
   System.out.println("Tv desligada");
  }

  void SubirCanal(){
    canal++;
    System.out.println("canal subiu");
  }
  void DescerCanal(){
    if(canal>1){
    canal--;
    System.out.println("canal desceu");
    }else{
      System.out.println("ja ta no primeiro  canal");
  } 
}
