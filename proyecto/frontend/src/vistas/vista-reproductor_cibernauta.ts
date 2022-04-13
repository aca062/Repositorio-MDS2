import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-reproductor_cibernauta')
export class VistaReproductor_cibernauta extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing" id="layoutReproductor" style="width: 100%; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-l);">
  <vaadin-vertical-layout theme="spacing" id="layoutCancion" style="align-items: center;">
   <h3 id="h3NombreCancion">Canción</h3>
   <vaadin-button id="botonVerCreditos">
     Ver créditos 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutBotonReproducir" style="width: 70%; align-items: center; align-self: center;">
   <vaadin-button id="botonReproducir" style="background-image:url('https://e7.pngegg.com/pngimages/1014/34/png-clipart-scalable-graphics-computer-icons-media-player-button-angle-logo.png'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutVolumen" style="align-self: center;">
   <vaadin-button id="botonVolumen" style="background-image:url('https://cdn-icons-png.flaticon.com/512/25/25695.png'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
