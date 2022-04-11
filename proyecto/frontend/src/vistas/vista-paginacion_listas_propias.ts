import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_propia';

@customElement('vista-paginacion_listas_propias')
export class VistaPaginacion_listas_propias extends LitElement {
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
 <vaadin-horizontal-layout theme="spacing-l" id="layoutListas">
  <vista-lista_de_reproduccion_propia id="lista1"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="lista2"></vista-lista_de_reproduccion_propia>
  <vista-lista_de_reproduccion_propia id="lista3"></vista-lista_de_reproduccion_propia>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
