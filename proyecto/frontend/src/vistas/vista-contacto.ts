import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-messages/src/vaadin-message-input.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';

@customElement('vista-contacto')
export class VistaContacto extends LitElement {
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
 <vaadin-vertical-layout style="width: 100%; margin-top: var(--lumo-space-xl);background-color: var(--lumo-contrast-10pct);" id="layoutMensaje">
  <h2 style="align-self: center;" id="h2Titulo">Enviar mensaje al administrador</h2>
  <vaadin-text-field label="Asunto" style="align-self: center; width: 50%;" id="asunto"></vaadin-text-field>
  <vaadin-message-input style="align-self: center; width: 50%;" id="mensaje"></vaadin-message-input>
  <vaadin-button style="align-self: center;" id="cancelar">
    Cancelar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
