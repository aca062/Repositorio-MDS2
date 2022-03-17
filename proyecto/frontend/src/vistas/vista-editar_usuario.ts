import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
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
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="margin-left: 10%; width: 80%; height: 20%;">
  <img id="img" src="http://assets.stickpng.com/images/585e4beacb11b227491c3399.png">
  <vaadin-button id="vaadinButton" style="align-self: center; margin-left: 5%;">
   Añadir foto
  </vaadin-button>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Nick" id="nick"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Contraseña" id="contraseña"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout3" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="Confirmar contraseña" id="confirmarContraseña"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout4" style="margin-left: 10%; width: 80%;">
  <vaadin-text-field label="E-mail" id="eMail"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout5" style="margin-left: 10%; width: 80%; justify-content: flex-end;">
  <vaadin-button id="vaadinButton1" style="margin-right: 5%;">
   Cancelar
  </vaadin-button>
  <vaadin-button id="vaadinButton2" style="margin-right: 5%;">
   Confirmar
  </vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
