import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-ver_detalle_cancion')
export class VistaVer_detalle_cancion extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;" id="layoutPrincipal">
 <vaadin-horizontal-layout theme="spacing-xl" id="layoutCancion" style="width: 100%; justify-content: center; background-color: var(--lumo-contrast-10pct); padding: var(--lumo-space-xl); padding-top: var(--lumo-space-xl);">
  <vaadin-vertical-layout theme="spacing" id="layout">
   <img id="fotoCancion" style="width: 300px; height: 300px">
   <vaadin-button id="botonReproducir" style="align-self: center;">
     Reproducir 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="layoutInformacionBotones" style="align-self: center; width: 50%;">
   <h4 id="h4NombreCancion">120</h4>
   <vaadin-button id="botonArtista">
     Bad Bunny 
   </vaadin-button>
   <vaadin-button id="botonAlbum">
     El último tour del mundo 
   </vaadin-button>
   <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="width: 120%; align-items: center;">
    <vaadin-button id="botonMeGusta" style="background-image:url('https://e7.pngegg.com/pngimages/507/757/png-clipart-computer-icons-heart-like-button-like-share-comment-love-logo.png'); background-repeat:no-repeat;
        height:60px;
        width:30px;
        background-size: 60px 50px;
        background-position:center;
background-color: white;" src=""></vaadin-button>
    <vaadin-button id="anadirLista">
      Añadir a una lista 
    </vaadin-button>
    <vaadin-button id="botonVerCreditos">
      Ver creditos 
    </vaadin-button>
   </vaadin-horizontal-layout>
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
