import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-combo-box/src/vaadin-combo-box.js';

@customElement('vista-lista_de_reproduccion_favoritos')
export class VistaLista_de_reproduccion_favoritos extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; padding: var(--lumo-space-xl);" id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing-xl" id="layoutTitulo">
  <h1 id="h1Titulo">Lista de favoritos</h1>
  <vaadin-combo-box id="comboBox"></vaadin-combo-box>
 </vaadin-horizontal-layout>
 <h3 id="h3Creador">Paco12</h3>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;background-color: var(--lumo-contrast-10pct);" id="layoutLista">
  <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end;" id="layoutNumCanciones">
   <h2 style="margin-right: var(--lumo-space-xl);" id="numCanciones">3/1000</h2>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="listaCanciones"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
