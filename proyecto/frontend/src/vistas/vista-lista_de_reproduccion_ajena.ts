import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista_de_reproduccion_ajena')
export class VistaLista_de_reproduccion_ajena extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 200px; justify-content: center; padding: var(--lumo-space-s);" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout">
  <img id="img" style="width: 150px; height: 150px;" src="https://i.scdn.co/image/ab67706f0000000362a2b2b0d95d902b307837d2">
  <vaadin-button id="vaadinButton" style="align-self: center;">
    This is Juice WRLD 
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
