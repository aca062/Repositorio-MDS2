import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-lista_de_reproduccion_ajena';

@customElement('vista-paginacion_listas_ajenas')
export class VistaPaginacion_listas_ajenas extends LitElement {
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
<vaadin-vertical-layout id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing-l">
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
  <vista-lista_de_reproduccion_ajena></vista-lista_de_reproduccion_ajena>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
