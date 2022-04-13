import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-reproductor')
export class VistaReproductor extends LitElement {
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
   <h3 id="h3Cancion">Canción</h3>
   <vaadin-button id="botonVerCreditos">
     Ver créditos 
   </vaadin-button>
  </vaadin-vertical-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutBotones" style="width: 100%; justify-content: center; align-self: center;">
   <vaadin-button id="boton1" style="background-image:url('https://cdn-icons.flaticon.com/png/512/4211/premium/4211379.png?token=exp=1648381448~hmac=1c1f521abad799876b4055c34badd22d'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
   <vaadin-button id="boton2" style="background-image:url('https://cdn-icons.flaticon.com/png/512/4211/premium/4211391.png?token=exp=1648381448~hmac=e6e53dcf8ecc34fe57164b3026d9b8d9'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
   <vaadin-button id="botonReproducir" style="background-image:url('https://cdn-icons-png.flaticon.com/512/727/727245.png'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
   <vaadin-button id="boton3" style="background-image:url('https://cdn-icons.flaticon.com/png/512/4211/premium/4211386.png?token=exp=1648381448~hmac=bf17029b8c2f8e8cd2d10208a6652e77'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
   <vaadin-button id="boton4" style="background-image:url('https://cdn-icons.flaticon.com/png/512/4211/premium/4211373.png?token=exp=1648381448~hmac=93370e256b6b1c518201b42a406a3c91'); background-repeat:no-repeat;
        height:60px;
        width:70px;
        background-size: 60px 50px;
        background-position:center;"></vaadin-button>
  </vaadin-horizontal-layout>
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
