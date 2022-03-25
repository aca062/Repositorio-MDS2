import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-paginacion_listas_ajenas';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-paginacion_listas_propias';

@customElement('vista-ver_listas_comun')
export class VistaVer_listas_comun extends LitElement {
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
 <vaadin-horizontal-layout style="width: 100%; justify-content: space-between; align-items: center;">
  <h1>Listas de reproducción</h1>
  <h3>Mostrando 4 listas por página</h3>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing">
  <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout theme="spacing" style="align-self: flex-end; align-items: center;">
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545680.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF"></vaadin-button>
  <h3>Página 1 de 1</h3>
  <vaadin-button style="background-image:url('https://cdn-icons-png.flaticon.com/512/545/545682.png');
        background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 50px 50px;
        background-position:center;background-color: #FFFFFF"></vaadin-button>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`p</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`p</h1>
 </vaadin-horizontal-layout>
 <vista-paginacion_listas_ajenas></vista-paginacion_listas_ajenas>
 <vista-paginacion_listas_propias></vista-paginacion_listas_propias>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
