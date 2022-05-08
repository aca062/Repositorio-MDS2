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
 <h3 id="h3" style="align-self: flex-start; margin-left: var(--lumo-space-l);">Contacto</h3>
 <vaadin-vertical-layout theme="spacing" id="layoutInformacion" style="width: 80%; align-items: flex-start; align-self: center;">
  <h4 id="h4Telefono">+34 914257860</h4>
  <h4 id="h41Correo" style="flex-shrink: 1;">correo@gmail.com</h4>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
