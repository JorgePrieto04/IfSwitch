public class ifSwitch {
  public static void main(String[] args) {
    int dia = Integer.parseInt(args [0]);
    switch (dia) {
      case 1:
        System.out.println("El " + dia + "º día de la semana es Lunes");
        break;
      case 2:
        System.out.println("El " + dia + "º día de la semana es Martes");
        break;
      case 3:
        System.out.println("El " + dia + "º día de la semana es Miércoles");
        break;
      case 4:
        System.out.println("El " + dia + "º día de la semana es Jueves");
        break;
      case 5:
        System.out.println("El " + dia + "º día de la semana es Viernes");
        break;
      case 6:
        System.out.println("El " + dia + "º día de la semana es Sábado");
        break;
      case 7:
        System.out.println("El " + dia + "º día de la semana es Domingo");
        break;
    }	
    System.out.println("Por lo que " + finde(dia));
  }
  private static String finde(int dia) {
		if (dia == 6 || dia == 7) {
			return "ya es fin de semana";
		} else {
			return "todavía todavía no estamos a fin de semana";
		}
  }
}
