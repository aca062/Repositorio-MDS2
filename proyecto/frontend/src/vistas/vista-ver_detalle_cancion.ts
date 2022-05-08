import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-select/src/vaadin-select.js';
import '@vaadin/vaadin-list-box/src/vaadin-list-box.js';
import '@vaadin/vaadin-item/src/vaadin-item.js';

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
   <img id="fotoCancion" style="width: 300px;" src="https://i.scdn.co/image/ab67616d0000b273005ee342f4eef2cc6e8436ab">
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
    <vaadin-button id="botonMeGusta" style="background-image:url('http://assets.stickpng.com/images/5a02bfca18e87004f1ca4395.png'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;background-color:#FFFFFF"></vaadin-button>
    <vaadin-select value="Añadir a lista de reproduccion" id="anadirLista" style="width: 50%;">
     <template>
      <vaadin-list-box id="vaadinListBox" selected="0">
       <vaadin-item selected id="vaadinItem" style="width: 100px;">
         Añadir a lista de reproduccion 
       </vaadin-item>
       <vaadin-item id="vaadinItem1">
         Item two 
       </vaadin-item>
       <vaadin-item id="vaadinItem2">
         Item three 
       </vaadin-item>
      </vaadin-list-box>
     </template>
    </vaadin-select>
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
