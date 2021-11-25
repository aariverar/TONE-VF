Feature: Ejemplo Web My Store

  @CP001
  Scenario Outline: Ingreso de correo para registro My Store

      Given ingreso a la web My Store "<caso_prueba>"
      When  doy click en el boton Sign in
      And   ingreso mi correo "<caso_prueba>"
      And   doy click en el boton crear cuenta
      Then  valido el formulario

        Examples:
        |caso_prueba|
        |1|

    @CP002
    Scenario Outline: Registro Web My Store

      Given ingreso a la web My Store "<caso_prueba>"
      When registro mi correo "<email>"
      And lleno el formulario con los datos personales "<titulo>" "<nombre>" "<apellido>" "<clave>"
      And fecha de nacieminto "<dia>" "<mes>" "<anio>"
      And lleno los datos de mi direccion "<cia>" "<direccion>" "<ciudad>" "<estado>" "<cod_postal>"
      And ingreso mi "<celular>" "<referencia>"
      Then doy click en registrar y verifico mensaje

      Examples:
        |email                 |titulo|nombre            |apellido                 |clave     |dia|mes|anio|cia  |direccion   |ciudad|estado |cod_postal|celular   |referencia|
        |123456ABRAHAM@gmail.com|Hombre|Abraham Alexander |Rivera Rivadeneyra       |a123456789|30 |  7|2014|TOSFT|Av. Peru 111|LIMA  |Florida|24098     |999999999 |En Perú   |