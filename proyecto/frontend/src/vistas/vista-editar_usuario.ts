import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-password-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <h2 id="h2" style="margin-left: 10%;">Editar usuario</h2>
 <vaadin-vertical-layout theme="spacing" style="width: 90%; height: 700px; margin-left: var(--lumo-space-xl); background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl);" id="vaadinVerticalLayout1">
  <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="width: 80%;">
   <img id="img" src="https://i.pinimg.com/736x/cb/5d/64/cb5d64be736ab84602ee1bcd20303d4e.jpg" style="width: 150px; height: 150px; object-fit:contain">
   <vaadin-button id="vaadinButton" style="align-self: center; margin-left: 5%;">
     Añadir foto 
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-text-field label="Nick" id="nick" value="Paco12" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-password-field label="Contraseña" placeholder="Enter password" value="secret1" has-value id="contraseña" style="width: 60%;"></vaadin-password-field>
  <vaadin-password-field label="Confirmar contraseña" placeholder="Enter password" value="secret1" has-value id="confirmarContraseña" style="width: 60%;"></vaadin-password-field>
  <vaadin-text-field label="E-mail" id="eMail" value="paco12@gmail.com" style="width: 60%;" has-value></vaadin-text-field>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout5" style="margin-left: 10%; width: 80%; justify-content: flex-end; margin-top: var(--lumo-space-xl);">
   <vaadin-button id="vaadinButton1" style="margin-right: 5%;">
     Cancelar 
   </vaadin-button>
   <vaadin-button id="vaadinButton2" style="margin-right: 5%;">
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
