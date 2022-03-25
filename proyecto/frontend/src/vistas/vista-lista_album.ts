import { LitElement, html, css, customElement } from 'lit-element';
import './vista-album';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-lista_album')
export class VistaLista_album extends LitElement {
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
 <h1 id="h1">Albumes</h1>
 <vista-album></vista-album>
 <vista-album></vista-album>
 <vista-album></vista-album>
 <vaadin-horizontal-layout style="width: 100%; justify-content: flex-end;">
  <vaadin-button style="margin-right: var(--lumo-space-xl);">
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
