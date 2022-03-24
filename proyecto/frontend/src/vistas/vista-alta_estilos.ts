import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-alta_estilos')
export class VistaAlta_estilos extends LitElement {
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
 <h2 id="h2" style="margin-left: 10%;">Dar de alta estilo</h2>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="margin-left: 10%; width: 80%;background-color: var(--lumo-contrast-10pct);">
  <vaadin-text-field label="Nombre del estilo" id="nombreDelEstilo" value="Urbano Latino"></vaadin-text-field>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout1" style="margin-left: 10%; justify-content: flex-end; width: 80%;">
  <vaadin-button id="vaadinButton">
    Button 
  </vaadin-button>
  <vaadin-button id="vaadinButton1">
    Button 
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
