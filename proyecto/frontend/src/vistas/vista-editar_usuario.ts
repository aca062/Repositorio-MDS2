import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-upload/src/vaadin-upload.js';

@customElement('vista-editar_usuario')
export class VistaEditar_usuario extends LitElement {
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
 <h2 id="h2Titulo" style="margin-left: 10%;">Editar usuario</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 700px; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="layoutUsuarios">
  <vaadin-horizontal-layout id="layoutUsuario" style="width: 80%;">
   <img id="img">
   <vaadin-upload id="upload"></vaadin-upload>
   <vaadin-button id="eliminarFoto" style="align-self: center; margin-left: 5%;">
    Eliminar foto
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nick" id="nick" value="Paco12" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" has-value id="contraseña" style="width: 60%;"></vaadin-password-field>
  <vaadin-password-field label="Confirmar contraseña" placeholder="Enter password" value="secret1" has-value id="confirmarContraseña" style="width: 60%;"></vaadin-password-field>
  <vaadin-text-field label="E-mail" id="eMail" value="paco12@gmail.com" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-horizontal-layout id="layoutBotones" style="margin-left: 10%; width: 80%; justify-content: flex-end; margin-top: var(--lumo-space-xl);">
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
