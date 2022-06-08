import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-editar_artista')
export class VistaEditar_artista extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: 10%;">Editar artista</h2>
 <vaadin-vertical-layout style="height: 600px; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); width: 90%; padding: var(--lumo-space-xl);" id="layoutArtistas">
  <vaadin-horizontal-layout id="layoutArtista" style="height: 20%; width: 80%;" theme="spacing-l">
   <img id="imgArtista" src="https://cdn.pixabay.com/photo/2015/10/05/22/37/blank-profile-picture-973460_1280.png">
   <vaadin-upload id="upload"></vaadin-upload>
   <vaadin-button id="eliminarFoto" style="align-self: center;">
     Eliminar foto 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nick" id="nick" value="Bad bunny" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" has-value id="contrasena" style="width: 60%;"></vaadin-password-field>
  <vaadin-password-field label="Confirmar contraseña" placeholder="Enter password" value="secret1" has-value id="confirmarContrasena" style="width: 60%;"></vaadin-password-field>
  <vaadin-text-field label="E-mail" id="eMail" value="bbunny@gmail..com" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-combo-box id="dropdown"></vaadin-combo-box>
  <vaadin-horizontal-layout id="layoutBotones" style="margin-left: 10%; width: 90%; justify-content: flex-end;">
   <vaadin-button id="cancelar" style="margin-right: 5%;">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="confirmar" style="margin-right: 5%;">
     Confirmar 
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
