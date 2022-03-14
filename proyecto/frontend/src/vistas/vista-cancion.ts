import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

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
<vaadin-horizontal-layout class="content" style="align-items: baseline; width: fit-content;" id="vaadinHorizontalLayout">
 <vaadin-button id="vaadinButton" style="margin: var(--lumo-space-s);">
  Imagen reproducir
 </vaadin-button>
 <h5 id="h5" style="padding: var(--lumo-space-s);">Nombre canción</h5>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
