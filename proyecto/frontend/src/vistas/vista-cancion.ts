import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cancion')
export class VistaCancion extends LitElement {
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
<vaadin-horizontal-layout class="content" style="align-items: baseline; width: 100%;" id="vaadinHorizontalLayout">
 <vaadin-button id="vaadinButton" style="margin: var(--lumo-space-s);">
   Imagen reproducir 
 </vaadin-button>
 <vaadin-vertical-layout style="align-items: flex-start; width: 50%;">
  <h5 id="h5" style="padding: var(--lumo-space-s); width: 50%; align-self: flex-start;">Nombre canción</h5>
  <h5 style="width: 50%; padding: var(--lumo-space-s);">Número de reproducciones</h5>
 </vaadin-vertical-layout>
 <vaadin-button style="width: 10%; margin: var(--lumo-space-s);">
  Desmarcar favoritos
 </vaadin-button>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
