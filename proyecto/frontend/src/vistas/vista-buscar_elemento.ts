import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import './vista-buscar_administrador';

@customElement('vista-buscar_elemento')
export class VistaBuscar_elemento extends LitElement {
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
<vaadin-vertical-layout style="width: 100%;">
 <h1 style="margin-left: var(--lumo-space-xl);">Buscar elemento</h1>
 <vaadin-text-field placeholder="Search" style="align-self: center; width: 50%;">
  <iron-icon icon="lumo:search" slot="prefix"></iron-icon>
 </vaadin-text-field>
 <vista-buscar_administrador style="margin-left: var(--lumo-space-xl); width: 100%;"></vista-buscar_administrador>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
