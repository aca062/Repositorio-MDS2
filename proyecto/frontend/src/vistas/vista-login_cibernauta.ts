import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-login_cibernauta')
export class VistaLogin_cibernauta extends LitElement {
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
 <vaadin-vertical-layout theme="spacing" id="layoutLogin" style="width: 90%; height: 700px; align-self: center; align-items: center; flex-grow: 0; margin: 5%; background-color: var(--lumo-contrast-10pct);">
  <vaadin-button id="logo" style="margin-top: 7%; padding: var(--lumo-space-l); flex-grow: 1; width: 20%;" margin-top="">
    Logo 
  </vaadin-button>
  <vaadin-text-field label="Dirección de correo" id="textFieldCorreo" style="width: 40%;"></vaadin-text-field>
  <vaadin-text-field label="Contraseña" id="textFieldContrasena" style="width: 40%;"></vaadin-text-field>
  <vaadin-button id="botonHasOlvidadoContrasena">
   ¿Has olvidado la contraseña?
  </vaadin-button>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="width: 50%; flex-grow: 0; flex-shrink: 0; justify-content: center;">
   <vaadin-button id="botonRegistrarse">
     Registrarse 
   </vaadin-button>
   <vaadin-button id="botonIniciarSesion">
     Iniciar sesión 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutFacebook" style="align-items: baseline;">
   <vaadin-button id="botonFacebook">
     Button 
   </vaadin-button>
   <h5 id="textoFacebook">Iniciar sesión con Facebook</h5>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutGoogle" style="align-items: baseline; margin-bottom: var(--lumo-space-m);">
   <vaadin-button id="botonGoogle">
     Button 
   </vaadin-button>
   <h5 id="textoGoogle">Iniciar sesión con Google</h5>
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
