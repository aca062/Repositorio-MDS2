import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-lista_albumes';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver_todos_los_albumes')
export class VistaVer_todos_los_albumes extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between;">
  <vista-lista_albumes style="margin-left: var(--lumo-space-xl);"></vista-lista_albumes>
  <vaadin-vertical-layout theme="spacing" style="align-self: center; margin-right: var(--lumo-space-xl);">
   <h5>Mostrando 4 listas por pagina</h5>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing-l" style="align-self: flex-end; align-items: center; margin-right: var(--lumo-space-xl); margin-top: var(--lumo-space-xl);">
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545680.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF"></vaadin-button>
  <h5>Pagina X de X</h5>
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545682.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF"></vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
