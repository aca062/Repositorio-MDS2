import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-cancion_admin')
export class VistaCancion_admin extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="align-self: flex-start; align-items: center; height: 200px;">
  <img id="img" style="width: 150px; height: 150px; object-fit: contain" src="https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab">
  <h4 id="h4">120</h4>
  <vaadin-button id="vaadinButton">
    Editar 
  </vaadin-button>
  <vaadin-button id="vaadinButton1">
    Eliminar 
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
