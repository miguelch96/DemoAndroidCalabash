Feature: Login feature
  As a admin
  I want to access to the application
  So I can see the home page

  Scenario: FB - Ingresar con cuenta correcta
    Given I wait for the "MainActivity" screen to appear
	When I enter "david2@gmail.com" into input field number 1
	And I enter "12345" into input field number 2
	And I press "Ingresar"
	Then I should see "Bienvenido david"
	And I wait for 5 seconds

  Scenario: FA1 - Ingresar dejando campos en blanco
    Given I wait for the "MainActivity" screen to appear
	When I enter "" into input field number 1
	And I enter "" into input field number 2
	And I press "Ingresar"
	Then I should see "Debe llenar todos los campos"
	And I wait for 5 seconds
	
   Scenario: FA2 - Ingresar con cuentas que no existen en el sistema
    Given I wait for the "MainActivity" screen to appear
	When I enter "pepito@gmail.com" into input field number 1
	And I enter "12345" into input field number 2
	And I press "Ingresar"
	Then I should see "Email o contraseña incorrecta"
	And I wait for 5 seconds
