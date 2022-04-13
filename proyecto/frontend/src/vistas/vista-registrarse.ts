import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-registrarse')
export class VistaRegistrarse extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <vaadin-vertical-layout theme="spacing" style="margin: var(--lumo-space-xl); align-items: center;" id="layoutFoto">
  <img style="width: 30%;" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png" id="fotoPerfil">
  <vaadin-button id="botonCambiarFoto">
    Añadir foto de perfil 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%; padding: var(--lumo-space-xl); padding-left: 10%; padding-right: 10%; padding-top: 0; padding-bottom: 0;" id="layoutFormulario">
  <vaadin-text-field error-message="Por favor, introduzca un e-mail válido" required invalid="" label="E-mail" style="width: 100%;" id="eMail"></vaadin-text-field>
  <vaadin-text-field error-message="Por favor, introduzca un nick válido" required invalid="" label="Nick" style="width: 100%;" id="nick"></vaadin-text-field>
  <vaadin-text-field error-message="Por favor, introduzca una contraseña válida" required invalid="" label="Contraseña" style="width: 100%;" id="contraseña"></vaadin-text-field>
  <vaadin-text-field error-message="Por favor, introduzca la misma contraseña que arriba" required invalid="" label="Repetir contraseña" style="width: 100%;" id="repetirContraseña"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing" style="width: 100%; justify-content: center;" id="layoutBotones">
   <vaadin-button id="botonIniciarSesion">
     Iniciar sesión 
   </vaadin-button>
   <vaadin-button id="botonCrearCuenta">
     Crear cuenta 
   </vaadin-button>
   <vaadin-button id="botonCancelar">
     Cancelar 
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
