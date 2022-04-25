import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-pie_de_pagina')
export class VistaPie_de_pagina extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; background-color: var(--lumo-contrast-10pct); align-items: center; justify-content: space-between;" id="layoutPrincipal">
 <h5 id="h5" style="align-self: flex-start; margin-left: var(--lumo-space-l);">Contacto o algo así</h5>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
