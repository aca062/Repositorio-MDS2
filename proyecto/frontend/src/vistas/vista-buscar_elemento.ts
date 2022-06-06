import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@polymer/iron-icon/iron-icon.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

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
<vaadin-vertical-layout style="width: 100%;" id="layoutPrincipal">
 <h1 style="margin-left: var(--lumo-space-xl);" id="h1Titulo">Buscar elemento</h1>
 <vaadin-text-field placeholder="Search" style="align-self: center; width: 50%; margin: var(--lumo-space-xl); margin-top: 0;" id="buscador">
  <iron-icon icon="lumo:search" slot="prefix" id="ironIcon"></iron-icon>
 </vaadin-text-field>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" id="layoutBusqueda"></vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
